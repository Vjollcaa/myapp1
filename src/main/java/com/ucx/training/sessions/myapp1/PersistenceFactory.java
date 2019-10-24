package com.ucx.training.sessions.myapp1;

import com.ucx.training.sessions.myapp1.persistence.InMemoryDB;
import com.ucx.training.sessions.myapp1.persistence.InMemoryDBImpl;

public class PersistenceFactory {

    //Initializing InMemoryDBImpl
    public static InMemoryDB getInMemoryDBInstance(){
        return new InMemoryDBImpl();
    }
}
