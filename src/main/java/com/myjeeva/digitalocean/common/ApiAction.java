/*
 * The MIT License
 * 
 * Copyright (c) 2010-2015 Jeevanandam M. (myjeeva.com)
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
package com.myjeeva.digitalocean.common;

import com.myjeeva.digitalocean.pojo.Account;
import com.myjeeva.digitalocean.pojo.Action;
import com.myjeeva.digitalocean.pojo.Actions;
import com.myjeeva.digitalocean.pojo.Backups;
import com.myjeeva.digitalocean.pojo.Delete;
import com.myjeeva.digitalocean.pojo.Domain;
import com.myjeeva.digitalocean.pojo.DomainRecord;
import com.myjeeva.digitalocean.pojo.DomainRecords;
import com.myjeeva.digitalocean.pojo.Domains;
import com.myjeeva.digitalocean.pojo.Droplet;
import com.myjeeva.digitalocean.pojo.Droplets;
import com.myjeeva.digitalocean.pojo.Image;
import com.myjeeva.digitalocean.pojo.Images;
import com.myjeeva.digitalocean.pojo.Kernels;
import com.myjeeva.digitalocean.pojo.Key;
import com.myjeeva.digitalocean.pojo.Keys;
import com.myjeeva.digitalocean.pojo.Neighbors;
import com.myjeeva.digitalocean.pojo.Regions;
import com.myjeeva.digitalocean.pojo.Sizes;
import com.myjeeva.digitalocean.pojo.Snapshots;

/**
 * Enumeration of DigitalOcean RESTful resource information.
 * 
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * @since v2.0
 */
public enum ApiAction {

  // Droplet
  AVAILABLE_DROPLETS("/droplets", "droplets", RequestMethod.GET, Droplets.class),
  AVAILABLE_DROPLETS_KERNELS("/droplets/%s/kernels", "kernels", RequestMethod.GET, Kernels.class),
  GET_DROPLET_SNAPSHOTS("/droplets/%s/snapshots", "snapshots", RequestMethod.GET, Snapshots.class),
  GET_DROPLET_BACKUPS("/droplets/%s/backups", "backups", RequestMethod.GET, Backups.class),
  GET_DROPLET_NEIGHBORS("/droplets/%s/neighbors", "droplets", RequestMethod.GET, Droplets.class),
  GET_DROPLET_INFO("/droplets/%s", "droplet", RequestMethod.GET, Droplet.class),  
  CREATE_DROPLET("/droplets", "droplet", RequestMethod.POST, Droplet.class),
  DELETE_DROPLET("/droplets/%s", "delete", RequestMethod.DELETE, Delete.class),
  REBOOT_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  POWER_CYCLE_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  SHUTDOWN_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  POWER_OFF_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  POWER_ON_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class), 
  RESET_DROPLET_PASSWORD("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  RESIZE_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  RESTORE_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  REBUILD_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  RENAME_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  CHANGE_DROPLET_KERNEL("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  ENABLE_DROPLET_IPV6("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  ENABLE_DROPLET_BACKUPS("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  DISABLE_DROPLET_BACKUPS("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  ENABLE_DROPLET_PRIVATE_NETWORKING("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  SNAPSHOT_DROPLET("/droplets/%s/actions", "action", RequestMethod.POST, Action.class),
  

  // Account
  GET_ACCOUNT_INFO("/account", "account", RequestMethod.GET, Account.class),
  
  
  // Reports
  ALL_DROPLET_NEIGHBORS("/reports/droplet_neighbors", "neighbors", RequestMethod.GET, Neighbors.class),
  
  
  // Action
  AVAILABLE_ACTIONS("/actions", "actions", RequestMethod.GET, Actions.class),
  GET_ACTION_INFO("/actions/%s", "action", RequestMethod.GET, Action.class),
  GET_DROPLET_ACTIONS("/droplets/%s/actions", "actions", RequestMethod.GET, Actions.class),
  GET_IMAGE_ACTIONS("/images/%s/actions", "actions", RequestMethod.GET, Actions.class),
  
  
  // Image
  AVAILABLE_IMAGES("/images", "images", RequestMethod.GET, Images.class),  
  GET_IMAGE_INFO("/images/%s", "image", RequestMethod.GET, Image.class),  
  UPDATE_IMAGE_INFO("/images/%s", "image", RequestMethod.PUT, Image.class),
  DELETE_IMAGE("/images/%s", "delete", RequestMethod.DELETE, Delete.class),
  TRANSFER_IMAGE("/images/%s/actions", "action", RequestMethod.POST, Action.class),
  CONVERT_IMAGE("/images/%s/actions", "action", RequestMethod.POST, Action.class),
  
  
  // Region
  AVAILABLE_REGIONS("/regions", "regions", RequestMethod.GET, Regions.class),
  
  
  // Size
  AVAILABLE_SIZES("/sizes", "sizes", RequestMethod.GET, Sizes.class),
  
  
  // Domain
  AVAILABLE_DOMAINS("/domains", "domains", RequestMethod.GET, Domains.class),
  GET_DOMAIN_INFO("/domains/%s", "domain", RequestMethod.GET, Domain.class),
  CREATE_DOMAIN("/domains", "domain", RequestMethod.POST, Domain.class),  
  DELETE_DOMAIN("/domains/%s", "delete", RequestMethod.DELETE, Delete.class),
  
  
  // Domain Record
  GET_DOMAIN_RECORDS("/domains/%s/records", "domain_records", RequestMethod.GET, DomainRecords.class),
  GET_DOMAIN_RECORD_INFO("/domains/%s/records/%s", "domain_record", RequestMethod.GET, DomainRecord.class),
  CREATE_DOMAIN_RECORD("/domains/%s/records", "domain_record", RequestMethod.POST, DomainRecord.class),  
  UPDATE_DOMAIN_RECORD("/domains/%s/records/%s", "domain_record", RequestMethod.PUT, DomainRecord.class),
  DELETE_DOMAIN_RECORD("/domains/%s/records/%s", "delete", RequestMethod.DELETE, Delete.class),
  
  
  // Key
  AVAILABLE_KEYS("/account/keys", "ssh_keys", RequestMethod.GET, Keys.class),
  GET_KEY_INFO("/account/keys/%s", "ssh_key", RequestMethod.GET, Key.class),
  CREATE_KEY("/account/keys", "ssh_key", RequestMethod.POST, Key.class),  
  UPDATE_KEY("/account/keys/%s", "ssh_key", RequestMethod.PUT, Key.class),
  DELETE_KEY("/account/keys/%s", "delete", RequestMethod.DELETE, Delete.class);
   
  private String path;

  private String elementName;
  
  private RequestMethod method;

  private Class<?> clazz;

  ApiAction(String path, RequestMethod method) {
    this(path, null, method);
  }

  ApiAction(String path, String elementName) {
    this(path, elementName, RequestMethod.GET);
  }

  ApiAction(String path, String elementName, RequestMethod method) {
    this(path, elementName, method, null);
  }
  
  ApiAction(String path, String elementName, RequestMethod method, Class<?> clazz) {
    this.path = path;
    this.elementName = elementName;
    this.method = method;
    this.clazz = clazz;
  }

  /**
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * @return the elementName
   */
  public String getElementName() {
    return elementName;
  }

  /**
   * @return the method
   */
  public RequestMethod getMethod() {
    return method;
  }

  /**
   * @return the clazz
   */
  public Class<?> getClazz() {
    return clazz;
  }
}
