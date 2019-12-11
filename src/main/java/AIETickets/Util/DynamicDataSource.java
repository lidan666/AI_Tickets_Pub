package AIETickets.Util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.logging.Logger;


public class DynamicDataSource extends AbstractRoutingDataSource{
	@Override
	public Logger getParentLogger() {  
            return null;  
     }  
	@Override
     protected Object determineCurrentLookupKey() {  
            return DataSourceContextHolder. getDbType();  
     }  
}
