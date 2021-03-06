package org.vaadin.example;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { … }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class ApplicationDesign extends HorizontalLayout {
    protected Button menuToggle;
    protected CssLayout menuItems;
    protected Button composeButton;
    protected Button inboxButton;
    protected Button draftsButton;
    protected Button sentButton;
    protected Button junkButton;
    protected Button trashButton;
    protected Button flaggedButton;
    protected VerticalLayout content;
    protected ComboBox sortCombo;
    protected Button deleteButton;
    protected Button replyButton;
    protected Button replyAllButton;
    protected Button forwardButton;
    protected VerticalLayout messageList;

    public ApplicationDesign() {
        Design.read(this);
    }
}
