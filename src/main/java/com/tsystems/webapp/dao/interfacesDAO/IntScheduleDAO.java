package com.tsystems.webapp.dao.interfacesDAO;


import com.tsystems.webapp.model.ScheduleModel;
import java.util.List;

public interface IntScheduleDAO {
    //public void addSchedule( ScheduleModel schedule );
    //public void deleteSchedule( int id );
   // public void updateSchedule( ScheduleModel schedule);
    public List<ScheduleModel> getAllSchedules(int stationId);
    public ScheduleModel getScheduleById( int id );
}
