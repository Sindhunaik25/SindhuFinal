package com.sindhu.mongo.SpringMongo.main;

import java.net.UnknownHostException;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.MongoClient;
import com.sindhu.mongo.SpringMongo.model.Person;

public class SpringDataMongoDBMain {
	public static final String DB_NAME = "details";
	public static final String PERSON_COLLECTION = "Person";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;

	public static void main(String[] args) {
		try {
			MongoClient mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
			MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
			//Person p = new Person("104", "Pavan", "Sirsi, India");
			//mongoOps.insert(p, PERSON_COLLECTION);

			/*Person p1 = mongoOps.findOne(new Query(Criteria.where("name").is("Pavan")), Person.class,
					PERSON_COLLECTION);*/
			
			Query q1=new Query(Criteria.where("id").is("102"));
			Person p2=mongoOps.findOne(q1, Person.class,PERSON_COLLECTION);

			System.out.println(p2);

			//mongoOps.dropCollection(PERSON_COLLECTION);
			mongo.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
