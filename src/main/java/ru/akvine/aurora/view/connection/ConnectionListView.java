package ru.akvine.aurora.view.connection;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import ru.akvine.aurora.entity.Connection;
import ru.akvine.aurora.view.main.MainView;

@Route(value = "connections", layout = MainView.class)
@ViewController(id = "Connection.list")
@ViewDescriptor(path = "connection-list-view.xml")
@LookupComponent("connectionsDataGrid")
@DialogMode(width = "64em")
public class ConnectionListView extends StandardListView<Connection> {


}
