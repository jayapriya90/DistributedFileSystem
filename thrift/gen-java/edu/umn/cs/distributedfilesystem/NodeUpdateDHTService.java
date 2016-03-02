/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.umn.cs.distributedfilesystem;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-01")
public class NodeUpdateDHTService {

  public interface Iface {

    public edu.umn.cs.distributedfilesystem.State updateDHT(Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void updateDHT(Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public edu.umn.cs.distributedfilesystem.State updateDHT(Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist) throws org.apache.thrift.TException
    {
      send_updateDHT(nodelist);
      return recv_updateDHT();
    }

    public void send_updateDHT(Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist) throws org.apache.thrift.TException
    {
      updateDHT_args args = new updateDHT_args();
      args.setNodelist(nodelist);
      sendBase("updateDHT", args);
    }

    public edu.umn.cs.distributedfilesystem.State recv_updateDHT() throws org.apache.thrift.TException
    {
      updateDHT_result result = new updateDHT_result();
      receiveBase(result, "updateDHT");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "updateDHT failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void updateDHT(Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      updateDHT_call method_call = new updateDHT_call(nodelist, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class updateDHT_call extends org.apache.thrift.async.TAsyncMethodCall {
      private Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist;
      public updateDHT_call(Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.nodelist = nodelist;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("updateDHT", org.apache.thrift.protocol.TMessageType.CALL, 0));
        updateDHT_args args = new updateDHT_args();
        args.setNodelist(nodelist);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public edu.umn.cs.distributedfilesystem.State getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_updateDHT();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("updateDHT", new updateDHT());
      return processMap;
    }

    public static class updateDHT<I extends Iface> extends org.apache.thrift.ProcessFunction<I, updateDHT_args> {
      public updateDHT() {
        super("updateDHT");
      }

      public updateDHT_args getEmptyArgsInstance() {
        return new updateDHT_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public updateDHT_result getResult(I iface, updateDHT_args args) throws org.apache.thrift.TException {
        updateDHT_result result = new updateDHT_result();
        result.success = iface.updateDHT(args.nodelist);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("updateDHT", new updateDHT());
      return processMap;
    }

    public static class updateDHT<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, updateDHT_args, edu.umn.cs.distributedfilesystem.State> {
      public updateDHT() {
        super("updateDHT");
      }

      public updateDHT_args getEmptyArgsInstance() {
        return new updateDHT_args();
      }

      public AsyncMethodCallback<edu.umn.cs.distributedfilesystem.State> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<edu.umn.cs.distributedfilesystem.State>() { 
          public void onComplete(edu.umn.cs.distributedfilesystem.State o) {
            updateDHT_result result = new updateDHT_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            updateDHT_result result = new updateDHT_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, updateDHT_args args, org.apache.thrift.async.AsyncMethodCallback<edu.umn.cs.distributedfilesystem.State> resultHandler) throws TException {
        iface.updateDHT(args.nodelist,resultHandler);
      }
    }

  }

  public static class updateDHT_args implements org.apache.thrift.TBase<updateDHT_args, updateDHT_args._Fields>, java.io.Serializable, Cloneable, Comparable<updateDHT_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("updateDHT_args");

    private static final org.apache.thrift.protocol.TField NODELIST_FIELD_DESC = new org.apache.thrift.protocol.TField("nodelist", org.apache.thrift.protocol.TType.SET, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new updateDHT_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new updateDHT_argsTupleSchemeFactory());
    }

    public Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      NODELIST((short)1, "nodelist");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // NODELIST
            return NODELIST;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.NODELIST, new org.apache.thrift.meta_data.FieldMetaData("nodelist", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
              new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.umn.cs.distributedfilesystem.NodeInfo.class))));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(updateDHT_args.class, metaDataMap);
    }

    public updateDHT_args() {
    }

    public updateDHT_args(
      Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist)
    {
      this();
      this.nodelist = nodelist;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public updateDHT_args(updateDHT_args other) {
      if (other.isSetNodelist()) {
        Set<edu.umn.cs.distributedfilesystem.NodeInfo> __this__nodelist = new HashSet<edu.umn.cs.distributedfilesystem.NodeInfo>(other.nodelist.size());
        for (edu.umn.cs.distributedfilesystem.NodeInfo other_element : other.nodelist) {
          __this__nodelist.add(new edu.umn.cs.distributedfilesystem.NodeInfo(other_element));
        }
        this.nodelist = __this__nodelist;
      }
    }

    public updateDHT_args deepCopy() {
      return new updateDHT_args(this);
    }

    @Override
    public void clear() {
      this.nodelist = null;
    }

    public int getNodelistSize() {
      return (this.nodelist == null) ? 0 : this.nodelist.size();
    }

    public java.util.Iterator<edu.umn.cs.distributedfilesystem.NodeInfo> getNodelistIterator() {
      return (this.nodelist == null) ? null : this.nodelist.iterator();
    }

    public void addToNodelist(edu.umn.cs.distributedfilesystem.NodeInfo elem) {
      if (this.nodelist == null) {
        this.nodelist = new HashSet<edu.umn.cs.distributedfilesystem.NodeInfo>();
      }
      this.nodelist.add(elem);
    }

    public Set<edu.umn.cs.distributedfilesystem.NodeInfo> getNodelist() {
      return this.nodelist;
    }

    public updateDHT_args setNodelist(Set<edu.umn.cs.distributedfilesystem.NodeInfo> nodelist) {
      this.nodelist = nodelist;
      return this;
    }

    public void unsetNodelist() {
      this.nodelist = null;
    }

    /** Returns true if field nodelist is set (has been assigned a value) and false otherwise */
    public boolean isSetNodelist() {
      return this.nodelist != null;
    }

    public void setNodelistIsSet(boolean value) {
      if (!value) {
        this.nodelist = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case NODELIST:
        if (value == null) {
          unsetNodelist();
        } else {
          setNodelist((Set<edu.umn.cs.distributedfilesystem.NodeInfo>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case NODELIST:
        return getNodelist();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case NODELIST:
        return isSetNodelist();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof updateDHT_args)
        return this.equals((updateDHT_args)that);
      return false;
    }

    public boolean equals(updateDHT_args that) {
      if (that == null)
        return false;

      boolean this_present_nodelist = true && this.isSetNodelist();
      boolean that_present_nodelist = true && that.isSetNodelist();
      if (this_present_nodelist || that_present_nodelist) {
        if (!(this_present_nodelist && that_present_nodelist))
          return false;
        if (!this.nodelist.equals(that.nodelist))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_nodelist = true && (isSetNodelist());
      list.add(present_nodelist);
      if (present_nodelist)
        list.add(nodelist);

      return list.hashCode();
    }

    @Override
    public int compareTo(updateDHT_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetNodelist()).compareTo(other.isSetNodelist());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetNodelist()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodelist, other.nodelist);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("updateDHT_args(");
      boolean first = true;

      sb.append("nodelist:");
      if (this.nodelist == null) {
        sb.append("null");
      } else {
        sb.append(this.nodelist);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class updateDHT_argsStandardSchemeFactory implements SchemeFactory {
      public updateDHT_argsStandardScheme getScheme() {
        return new updateDHT_argsStandardScheme();
      }
    }

    private static class updateDHT_argsStandardScheme extends StandardScheme<updateDHT_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, updateDHT_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // NODELIST
              if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
                {
                  org.apache.thrift.protocol.TSet _set0 = iprot.readSetBegin();
                  struct.nodelist = new HashSet<edu.umn.cs.distributedfilesystem.NodeInfo>(2*_set0.size);
                  edu.umn.cs.distributedfilesystem.NodeInfo _elem1;
                  for (int _i2 = 0; _i2 < _set0.size; ++_i2)
                  {
                    _elem1 = new edu.umn.cs.distributedfilesystem.NodeInfo();
                    _elem1.read(iprot);
                    struct.nodelist.add(_elem1);
                  }
                  iprot.readSetEnd();
                }
                struct.setNodelistIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, updateDHT_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.nodelist != null) {
          oprot.writeFieldBegin(NODELIST_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.nodelist.size()));
            for (edu.umn.cs.distributedfilesystem.NodeInfo _iter3 : struct.nodelist)
            {
              _iter3.write(oprot);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class updateDHT_argsTupleSchemeFactory implements SchemeFactory {
      public updateDHT_argsTupleScheme getScheme() {
        return new updateDHT_argsTupleScheme();
      }
    }

    private static class updateDHT_argsTupleScheme extends TupleScheme<updateDHT_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, updateDHT_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetNodelist()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetNodelist()) {
          {
            oprot.writeI32(struct.nodelist.size());
            for (edu.umn.cs.distributedfilesystem.NodeInfo _iter4 : struct.nodelist)
            {
              _iter4.write(oprot);
            }
          }
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, updateDHT_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            org.apache.thrift.protocol.TSet _set5 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            struct.nodelist = new HashSet<edu.umn.cs.distributedfilesystem.NodeInfo>(2*_set5.size);
            edu.umn.cs.distributedfilesystem.NodeInfo _elem6;
            for (int _i7 = 0; _i7 < _set5.size; ++_i7)
            {
              _elem6 = new edu.umn.cs.distributedfilesystem.NodeInfo();
              _elem6.read(iprot);
              struct.nodelist.add(_elem6);
            }
          }
          struct.setNodelistIsSet(true);
        }
      }
    }

  }

  public static class updateDHT_result implements org.apache.thrift.TBase<updateDHT_result, updateDHT_result._Fields>, java.io.Serializable, Cloneable, Comparable<updateDHT_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("updateDHT_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.I32, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new updateDHT_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new updateDHT_resultTupleSchemeFactory());
    }

    /**
     * 
     * @see edu.umn.cs.distributedfilesystem.State
     */
    public edu.umn.cs.distributedfilesystem.State success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      /**
       * 
       * @see edu.umn.cs.distributedfilesystem.State
       */
      SUCCESS((short)0, "success");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, edu.umn.cs.distributedfilesystem.State.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(updateDHT_result.class, metaDataMap);
    }

    public updateDHT_result() {
    }

    public updateDHT_result(
      edu.umn.cs.distributedfilesystem.State success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public updateDHT_result(updateDHT_result other) {
      if (other.isSetSuccess()) {
        this.success = other.success;
      }
    }

    public updateDHT_result deepCopy() {
      return new updateDHT_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    /**
     * 
     * @see edu.umn.cs.distributedfilesystem.State
     */
    public edu.umn.cs.distributedfilesystem.State getSuccess() {
      return this.success;
    }

    /**
     * 
     * @see edu.umn.cs.distributedfilesystem.State
     */
    public updateDHT_result setSuccess(edu.umn.cs.distributedfilesystem.State success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((edu.umn.cs.distributedfilesystem.State)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof updateDHT_result)
        return this.equals((updateDHT_result)that);
      return false;
    }

    public boolean equals(updateDHT_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true && (isSetSuccess());
      list.add(present_success);
      if (present_success)
        list.add(success.getValue());

      return list.hashCode();
    }

    @Override
    public int compareTo(updateDHT_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("updateDHT_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class updateDHT_resultStandardSchemeFactory implements SchemeFactory {
      public updateDHT_resultStandardScheme getScheme() {
        return new updateDHT_resultStandardScheme();
      }
    }

    private static class updateDHT_resultStandardScheme extends StandardScheme<updateDHT_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, updateDHT_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                struct.success = edu.umn.cs.distributedfilesystem.State.findByValue(iprot.readI32());
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, updateDHT_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          oprot.writeI32(struct.success.getValue());
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class updateDHT_resultTupleSchemeFactory implements SchemeFactory {
      public updateDHT_resultTupleScheme getScheme() {
        return new updateDHT_resultTupleScheme();
      }
    }

    private static class updateDHT_resultTupleScheme extends TupleScheme<updateDHT_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, updateDHT_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          oprot.writeI32(struct.success.getValue());
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, updateDHT_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = edu.umn.cs.distributedfilesystem.State.findByValue(iprot.readI32());
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}
