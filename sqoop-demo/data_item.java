// ORM class for table 'data_item'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Nov 27 13:47:33 CST 2020
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class data_item extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        data_item.this.id = (Long)value;
      }
    });
    setters.put("deleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        data_item.this.deleted = (Integer)value;
      }
    });
    setters.put("create_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        data_item.this.create_date = (java.sql.Timestamp)value;
      }
    });
    setters.put("update_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        data_item.this.update_date = (java.sql.Timestamp)value;
      }
    });
    setters.put("name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        data_item.this.name = (String)value;
      }
    });
    setters.put("number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        data_item.this.number = (String)value;
      }
    });
    setters.put("mark", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        data_item.this.mark = (String)value;
      }
    });
  }
  public data_item() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public data_item with_id(Long id) {
    this.id = id;
    return this;
  }
  private Integer deleted;
  public Integer get_deleted() {
    return deleted;
  }
  public void set_deleted(Integer deleted) {
    this.deleted = deleted;
  }
  public data_item with_deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }
  private java.sql.Timestamp create_date;
  public java.sql.Timestamp get_create_date() {
    return create_date;
  }
  public void set_create_date(java.sql.Timestamp create_date) {
    this.create_date = create_date;
  }
  public data_item with_create_date(java.sql.Timestamp create_date) {
    this.create_date = create_date;
    return this;
  }
  private java.sql.Timestamp update_date;
  public java.sql.Timestamp get_update_date() {
    return update_date;
  }
  public void set_update_date(java.sql.Timestamp update_date) {
    this.update_date = update_date;
  }
  public data_item with_update_date(java.sql.Timestamp update_date) {
    this.update_date = update_date;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public data_item with_name(String name) {
    this.name = name;
    return this;
  }
  private String number;
  public String get_number() {
    return number;
  }
  public void set_number(String number) {
    this.number = number;
  }
  public data_item with_number(String number) {
    this.number = number;
    return this;
  }
  private String mark;
  public String get_mark() {
    return mark;
  }
  public void set_mark(String mark) {
    this.mark = mark;
  }
  public data_item with_mark(String mark) {
    this.mark = mark;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof data_item)) {
      return false;
    }
    data_item that = (data_item) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.deleted == null ? that.deleted == null : this.deleted.equals(that.deleted));
    equal = equal && (this.create_date == null ? that.create_date == null : this.create_date.equals(that.create_date));
    equal = equal && (this.update_date == null ? that.update_date == null : this.update_date.equals(that.update_date));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.number == null ? that.number == null : this.number.equals(that.number));
    equal = equal && (this.mark == null ? that.mark == null : this.mark.equals(that.mark));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof data_item)) {
      return false;
    }
    data_item that = (data_item) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.deleted == null ? that.deleted == null : this.deleted.equals(that.deleted));
    equal = equal && (this.create_date == null ? that.create_date == null : this.create_date.equals(that.create_date));
    equal = equal && (this.update_date == null ? that.update_date == null : this.update_date.equals(that.update_date));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.number == null ? that.number == null : this.number.equals(that.number));
    equal = equal && (this.mark == null ? that.mark == null : this.mark.equals(that.mark));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.deleted = JdbcWritableBridge.readInteger(2, __dbResults);
    this.create_date = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.update_date = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.name = JdbcWritableBridge.readString(5, __dbResults);
    this.number = JdbcWritableBridge.readString(6, __dbResults);
    this.mark = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.deleted = JdbcWritableBridge.readInteger(2, __dbResults);
    this.create_date = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.update_date = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.name = JdbcWritableBridge.readString(5, __dbResults);
    this.number = JdbcWritableBridge.readString(6, __dbResults);
    this.mark = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(deleted, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_date, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_date, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(number, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mark, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(deleted, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_date, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_date, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(number, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mark, 7 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.deleted = null;
    } else {
    this.deleted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.create_date = null;
    } else {
    this.create_date = new Timestamp(__dataIn.readLong());
    this.create_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.update_date = null;
    } else {
    this.update_date = new Timestamp(__dataIn.readLong());
    this.update_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.number = null;
    } else {
    this.number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mark = null;
    } else {
    this.mark = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.deleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.deleted);
    }
    if (null == this.create_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_date.getTime());
    __dataOut.writeInt(this.create_date.getNanos());
    }
    if (null == this.update_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_date.getTime());
    __dataOut.writeInt(this.update_date.getNanos());
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, number);
    }
    if (null == this.mark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mark);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.deleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.deleted);
    }
    if (null == this.create_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_date.getTime());
    __dataOut.writeInt(this.create_date.getNanos());
    }
    if (null == this.update_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_date.getTime());
    __dataOut.writeInt(this.update_date.getNanos());
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, number);
    }
    if (null == this.mark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mark);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deleted==null?"null":"" + deleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_date==null?"null":"" + create_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_date==null?"null":"" + update_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number==null?"null":number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mark==null?"null":mark, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deleted==null?"null":"" + deleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_date==null?"null":"" + create_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_date==null?"null":"" + update_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number==null?"null":number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mark==null?"null":mark, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deleted = null; } else {
      this.deleted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_date = null; } else {
      this.create_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_date = null; } else {
      this.update_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.number = null; } else {
      this.number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mark = null; } else {
      this.mark = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deleted = null; } else {
      this.deleted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_date = null; } else {
      this.create_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_date = null; } else {
      this.update_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.number = null; } else {
      this.number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mark = null; } else {
      this.mark = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    data_item o = (data_item) super.clone();
    o.create_date = (o.create_date != null) ? (java.sql.Timestamp) o.create_date.clone() : null;
    o.update_date = (o.update_date != null) ? (java.sql.Timestamp) o.update_date.clone() : null;
    return o;
  }

  public void clone0(data_item o) throws CloneNotSupportedException {
    o.create_date = (o.create_date != null) ? (java.sql.Timestamp) o.create_date.clone() : null;
    o.update_date = (o.update_date != null) ? (java.sql.Timestamp) o.update_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("deleted", this.deleted);
    __sqoop$field_map.put("create_date", this.create_date);
    __sqoop$field_map.put("update_date", this.update_date);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("number", this.number);
    __sqoop$field_map.put("mark", this.mark);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("deleted", this.deleted);
    __sqoop$field_map.put("create_date", this.create_date);
    __sqoop$field_map.put("update_date", this.update_date);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("number", this.number);
    __sqoop$field_map.put("mark", this.mark);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
