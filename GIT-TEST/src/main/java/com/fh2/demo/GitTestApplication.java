package com.fh2.demo;

import java.sql.Date;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication implements CommandLineRunner{
	

	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
		
	}

	@Override 
	public void run(String... args) throws Exception {
		System.out.println("This is a just a test !!");
        

		
		
	}
	
	class AlertService {

		private final AlertDAO storage ; 
		    
		    public AlertService(AlertDAO storage){
		        this.storage=storage;
		    }
		   // private final MapAlertDAO storage = new MapAlertDAO();
				
		    public UUID raiseAlert() {
		        return this.storage.addAlert(new Date(0));
		    }
			
		    public Date getAlertTime(UUID id) {
		        return this.storage.getAlert(id);
		    }	
		}

		class MapAlertDAO implements AlertDAO{
		    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();
			@Override
		    public UUID addAlert(Date time) {
		    	UUID id = UUID.randomUUID();
		        this.alerts.put(id, time);
		        return id;
		    }
			@Override
		    public Date getAlert(UUID id) {
		        return this.alerts.get(id);
		    }	
		}
		interface AlertDAO {
		    public UUID addAlert(Date time);
		     public Date getAlert(UUID id);
		}	

    

}

 
