module br.ufrpe.socialnet.socialnetgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens br.ufrpe.socialnet.socialnetgui to javafx.fxml;
    exports br.ufrpe.socialnet.socialnetgui;
}