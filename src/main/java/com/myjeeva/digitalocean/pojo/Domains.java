/**
 * The MIT License
 * 
 * Copyright (c) 2013-2017 Jeevanandam M. (myjeeva.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.myjeeva.digitalocean.pojo;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Represents Domains attributes
 * 
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * @since v2.0
 */
public class Domains extends Base {

  private static final long serialVersionUID = 403429426585596826L;

  private List<Domain> domains;

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /**
   * @return the domains
   */
  public List<Domain> getDomains() {
    return domains;
  }

  /**
   * @param domains the domains to set
   */
  public void setDomains(List<Domain> domains) {
    this.domains = domains;
  }
}
