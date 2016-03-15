import com.tsystems.webapp.dao.DAOFactory;
import com.tsystems.webapp.dao.impl.TrainDAO;
import com.tsystems.webapp.dao.MySQLDAOFactory;
import com.tsystems.webapp.model.TrainModel;
import junit.framework.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class DAOTest {

    /*
    @Test
    public void testGetAll() throws Exception {
        DAOFactory daoFactory = new MySQLDAOFactory();
        List<TrainModel> list;
        try (Connection con = daoFactory.getConnection())
        {
            TrainDAO dao = daoFactory.getTrainDAO(con);
            list = dao.getAll();
        }
        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0);
    }
*/

}

