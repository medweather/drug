package com.company.drug.web.screens.statusmedicamentregistration;

import com.company.drug.entity.StatusMedicamentRegistration;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.FileUploadField;
import com.haulmont.cuba.gui.components.UploadField;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;

import javax.inject.Inject;
import java.util.Objects;

@UiController("drug_StatusMedicamentRegistration.edit")
@UiDescriptor("status-medicament-registration-edit.xml")
@EditedEntityContainer("statusMedicamentRegistrationDc")
@LoadDataBeforeShow
public class StatusMedicamentRegistrationEdit extends StandardEditor<StatusMedicamentRegistration> {

    @Inject
    private FileUploadField attachmentUploadField;
    @Inject
    private FileUploadingAPI fileUploadingAPI;
    @Inject
    private DataManager dataManager;
    @Inject
    private Notifications notifications;
    @Inject
    private Messages messages;

    @Subscribe("attachmentUploadField")
    public void onAttachmentUploadFieldFileUploadSucceed(FileUploadField.FileUploadSucceedEvent event) {
        FileDescriptor fd = attachmentUploadField.getFileDescriptor();
        try {
            fileUploadingAPI.putFileIntoStorage(attachmentUploadField.getFileId(), Objects.requireNonNull(fd));
        } catch (FileStorageException e) {
            throw new RuntimeException(messages.getMessage(getClass(), "errorSaving"), e);
        }
        dataManager.commit(fd);
        notifications.create()
                .withCaption(messages.getMessage(getClass(), "uploaded") + attachmentUploadField.getFileName())
                .show();
    }

    @Subscribe("attachmentUploadField")
    public void onAttachmentUploadFieldFileUploadError(UploadField.FileUploadErrorEvent event) {
        notifications.create()
                .withCaption(messages.getMessage(getClass(), "uploadError"))
                .show();
    }
}