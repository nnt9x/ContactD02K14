package com.example.contactd02k14;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.example.contactd02k14.model.Contact;

public abstract class CreateContactDialog extends Dialog {
    public CreateContactDialog(@NonNull Context context) {
        super(context);
    }

    private EditText edtName, edtPhone, edtEmail;
    private Button btnSave;

    public abstract void getContactData(Contact contact);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_create_contact);
        // Bind Id
        edtName = findViewById(R.id.edt_dialog_name);
        edtPhone =findViewById(R.id.edt_dialog_phone);
        edtEmail = findViewById(R.id.edt_dialog_email);
        btnSave = findViewById(R.id.btn_save);
        // Bat su kien onClick

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lay du lieu tu EditText
                Contact contact = new Contact();
                contact.setName(edtName.getText().toString());
                contact.setEmail(edtEmail.getText().toString());
                contact.setPhone(edtPhone.getText().toString());
                //
                getContactData(contact);

                // An dialog
                dismiss();
            }
        });
    }

    @Override
    public void dismiss() {
        super.dismiss();
        edtPhone.setText("");
        edtEmail.setText("");
        edtName.setText("");
    }
}
