package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/blue/workspace/Zulu/zulu-platform-build/zulu-src.git/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, April 18, 2023 1:36:32 AM PDT
*/

public final class ServerAlreadyActive extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerAlreadyActive ()
  {
    super(ServerAlreadyActiveHelper.id());
  } // ctor

  public ServerAlreadyActive (String _serverId)
  {
    super(ServerAlreadyActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyActive (String $reason, String _serverId)
  {
    super(ServerAlreadyActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyActive
