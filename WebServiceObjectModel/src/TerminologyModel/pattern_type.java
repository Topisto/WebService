/**
 * PatternType.java
 *
 */

package TerminologyModel;

public class pattern_type implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3487876851599906405L;
	private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected pattern_type(java.lang.String value) 
    {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TERM_PATTERN = "TERM_PATTERN";
    public static final java.lang.String _DEFINITION_PATTERN = "DEFINITION_PATTERN";
    public static final java.lang.String _ABBREVIATION_PATTERN = "ABBREVIATION_PATTERN";
    public static final java.lang.String _TEXTUAL_SYMBOL_PATTERN = "TEXTUAL_SYMBOL_PATTERN";
    public static final java.lang.String _ORIGINATOR_REFERENCE_PATTERN = "ORIGINATOR_REFERENCE_PATTERN";
    public static final pattern_type TERM_PATTERN = new pattern_type(_TERM_PATTERN);
    public static final pattern_type DEFINITION_PATTERN = new pattern_type(_DEFINITION_PATTERN);
    public static final pattern_type ABBREVIATION_PATTERN = new pattern_type(_ABBREVIATION_PATTERN);
    public static final pattern_type TEXTUAL_SYMBOL_PATTERN = new pattern_type(_TEXTUAL_SYMBOL_PATTERN);
    public static final pattern_type ORIGINATOR_REFERENCE_PATTERN = new pattern_type(_ORIGINATOR_REFERENCE_PATTERN);
   
    public java.lang.String getValue() 
    { 	
    	return _value_;
    }
    
    public static pattern_type fromValue(java.lang.String value) throws java.lang.IllegalArgumentException 
    {
        pattern_type enumeration = (pattern_type)
            _table_.get(value);
        if (enumeration==null) 
        	throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static pattern_type fromString(java.lang.String value) throws java.lang.IllegalArgumentException 
    {
        return fromValue(value);
    }
    
    public boolean equals(java.lang.Object obj)
    {
    	return (obj == this);
    }
    
    public int hashCode() 
    { 
    	return toString().hashCode();
    }
    
    public java.lang.String toString() 
    { 
    	return _value_;
    }
    
    public java.lang.Object readResolve() throws java.io.ObjectStreamException 
    { 
    	return fromValue(_value_);
    }
  }
