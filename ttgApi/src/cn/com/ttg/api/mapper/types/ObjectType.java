package cn.com.ttg.api.mapper.types;

import java.lang.reflect.Field;

import cn.com.ttg.api.json.JSONObject;
import cn.com.ttg.api.mapper.JsonMappingException;


public class ObjectType extends Type {

    private static ObjectType INSTANCE;

    @Override
    public void set(Field field, Object object, Object value) throws JsonMappingException {
    	if (value == JSONObject.NULL) {
			return;
		}
        try {
            if(value instanceof JSONObject){
                JSONObject objectJsonObject = (JSONObject) value;
                field.set(object, MAPPER.map(objectJsonObject, field.getType()));
            }
        } catch (Exception e) {
            throw new JsonMappingException(e);
        }
    }

    public static Type getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ObjectType();
        }
        return INSTANCE;
    }
}