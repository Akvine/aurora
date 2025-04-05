package ru.akvine.aurora.view.connection;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.*;
import ru.akvine.aurora.entity.Connection;
import ru.akvine.aurora.enums.DatabaseType;
import ru.akvine.aurora.view.main.MainView;

@Route(value = "connections/:id", layout = MainView.class)
@ViewController(id = "Connection.detail")
@ViewDescriptor(path = "connection-detail-view.xml")
@EditedEntityContainer("connectionsDc")
public class ConnectionDetailView extends StandardDetailView<Connection> {
    @ViewComponent
    private JmixComboBox<DatabaseType> databaseTypeComboBox;

    @Subscribe
    public void onInit(InitEvent event) {
        databaseTypeComboBox.setItems(DatabaseType.class);
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
       getEditedEntity();
    }
}
