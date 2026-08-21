module br.ufrpe.javafx.tab_pane_demo.tabpanedemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens br.ufrpe.javafx.tab_pane_demo.tabpanedemo to javafx.fxml;
    exports br.ufrpe.javafx.tab_pane_demo.tabpanedemo;
}