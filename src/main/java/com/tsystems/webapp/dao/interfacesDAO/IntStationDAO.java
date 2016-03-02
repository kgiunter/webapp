package com.tsystems.webapp.dao.interfacesDAO;


import com.tsystems.webapp.model.StationModel;
import java.util.List;

public interface IntStationDAO {
    public void addStation( StationModel Station );
    public void deleteStation( int id );
    public void updateStation( StationModel station );
    public List<StationModel> getAllStations();
    public StationModel getStationById( int id );
}
