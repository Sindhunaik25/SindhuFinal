package com.sindhu.corejava;

public abstract class Persistance {
	abstract public void persist();
public static void main(String[] args) {
	FilePersistance filePersistance=new FilePersistance();
	filePersistance.persist();
	
	DatabasePersistance databasePersistance=new DatabasePersistance();
	databasePersistance.persist();
}
}
