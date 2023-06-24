package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/USER_EXCEPTION.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/blue/workspace/Zulu/zulu-platform-build/zulu-src.git/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, April 18, 2023 1:36:31 AM PDT
*/

public interface USER_EXCEPTION
{

  /**
     * Indicates a UserException reply status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SUCCESSFUL
     * @see SYSTEM_EXCEPTION
     * @see LOCATION_FORWARD
     * @see TRANSPORT_RETRY
     */
  public static final short value = (short)(2);
}