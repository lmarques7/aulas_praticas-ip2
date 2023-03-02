module br.ufrpe.filmes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens br.ufrpe.filmes to javafx.fxml;
    opens br.ufrpe.filmes.gui to javafx.fxml;
    opens br.ufrpe.filmes.models to javafx.fxml;
    exports br.ufrpe.filmes;
    exports br.ufrpe.filmes.models;
}