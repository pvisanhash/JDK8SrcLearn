package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/NotFound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/blue/workspace/Zulu/zulu-platform-build/zulu-src.git/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Tuesday, April 18, 2023 1:36:31 AM PDT
*/

public final class NotFound extends org.omg.CORBA.UserException
{
  public org.omg.CosNaming.NamingContextPackage.NotFoundReason why = null;
  public org.omg.CosNaming.NameComponent rest_of_name[] = null;

  public NotFound ()
  {
    super(NotFoundHelper.id());
  } // ctor

  public NotFound (org.omg.CosNaming.NamingContextPackage.NotFoundReason _why, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(NotFoundHelper.id());
    why = _why;
    rest_of_name = _rest_of_name;
  } // ctor


  public NotFound (String $reason, org.omg.CosNaming.NamingContextPackage.NotFoundReason _why, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(NotFoundHelper.id() + "  " + $reason);
    why = _why;
    rest_of_name = _rest_of_name;
  } // ctor

} // class NotFound
