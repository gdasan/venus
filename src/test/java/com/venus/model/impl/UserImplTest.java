package com.venus.model.impl;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.venus.model.User;
import com.venus.util.VenusSession;
import com.venus.util.VenusSessionFactory;


public class UserImplTest extends BaseImplTest {
  private Session sess;
  
  @Before
  public void setUp() {
    VenusSession vs = getVenusSession();
    sess = vs.getSession();
  }

  @Test
  public void testCreateUser() throws Exception {
   Transaction trans = sess.beginTransaction();

   User user = new UserImpl();
   user.setUsername("ravi-" + getUniqueName());
   user.setFirstName("ravi");
   user.setLastName("ravi");

   sess.save(user);
   trans.commit();
  }

}