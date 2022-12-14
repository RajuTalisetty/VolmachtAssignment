package nl.rabobank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import nl.rabobank.mongo.MongoConfiguration;

@SpringBootApplication
@Import(MongoConfiguration.class)
public class VolmachtAssignmentApplication
{
    public static void main(final String[] args)
    {
        SpringApplication.run(VolmachtAssignmentApplication.class, args);
    }
}
