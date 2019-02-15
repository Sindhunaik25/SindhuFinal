package com.sindhu.mongo.SpringMongo.dao;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.WriteResult;
import com.sindhu.mongo.SpringMongo.model.Person;

public class PersonDAOImpl implements PersonDAO {
	private MongoOperations mongoOps;

	public PersonDAOImpl(MongoOperations mongoOps) {
		super();
		this.mongoOps = mongoOps;
	}

	private static final String PERSON_COLLECTION = "Person";

	public void create(Person p) {
		this.mongoOps.insert(p,PERSON_COLLECTION);
	}

	public Person readById(String id) {

		Query query = new Query(Criteria.where("_id").is(id));
		return this.mongoOps.findOne(query, Person.class, PERSON_COLLECTION);
	}

	public void update(Person p) {
		this.mongoOps.save(p, PERSON_COLLECTION);
	}

	public int deleteById(String id) {

		Query query = new Query(Criteria.where("_id").is(id));
		WriteResult result = this.mongoOps.remove(query, Person.class, PERSON_COLLECTION);
		return result.getN();
	}

}
