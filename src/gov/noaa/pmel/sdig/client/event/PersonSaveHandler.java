package gov.noaa.pmel.sdig.client.event;

import com.google.gwt.event.shared.EventHandler;

/**
 * Created by rhs on 2/28/17.
 */
public interface PersonSaveHandler extends EventHandler {
    void onPersonSave(PersonSave event);
}
