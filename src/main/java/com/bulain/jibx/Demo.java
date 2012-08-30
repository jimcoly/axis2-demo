
package com.bulain.jibx;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://bulain.com/jibx/demo/1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="demo">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="request" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="response" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Demo
{
    private String request;
    private String response;

    /** 
     * Get the 'request' element value.
     * 
     * @return value
     */
    public String getRequest() {
        return request;
    }

    /** 
     * Set the 'request' element value.
     * 
     * @param request
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /** 
     * Get the 'response' element value.
     * 
     * @return value
     */
    public String getResponse() {
        return response;
    }

    /** 
     * Set the 'response' element value.
     * 
     * @param response
     */
    public void setResponse(String response) {
        this.response = response;
    }
}
