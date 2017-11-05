package ru.sbt.kmdtransform;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 */
public enum TransformType {
    LONG {
        @Override public Object fromStr(String value) {
            if (value == null || value.equals(""))
                return null;
            return Long.valueOf(value);
        }
    },

    ROOT {
        @Override public Object fromStr(String value) {
            throw new RuntimeException("!!!");
        }
    },

    PARTITION {
        @Override public Object fromStr(String value) {
            throw new RuntimeException("!!!");
        }
    },

    INTEGER {
        @Override public Object fromStr(String value) {
            if (value == null || value.equals(""))
                return null;
            return Integer.valueOf(value);
        }
    },

    BIGDECIMAL {
        @Override public Object fromStr(String value) {
            if (value == null || value.equals(""))
                return null;
            return new BigDecimal(value);
        }
    },

    DATE_TIME {
        ThreadLocal<SimpleDateFormat> format = new ThreadLocal<SimpleDateFormat>() {
            @Override protected SimpleDateFormat initialValue() {
                return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            }
        };

        @Override public Object fromStr(String value) {
            if (value == null || value.equals(""))
                return null;
            try {
                return format.get().parse(value);
            }
            catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    },

    CSL_PARTICLES {
        @Override public Object fromStr(String value) {
            throw new RuntimeException("!!!");
        }
    },

    COMPOSEKEY {
        @Override public Object fromStr(String value) {
            throw new RuntimeException("!!!");
        }
    },

    BOOLEAN {
        @Override public Object fromStr(String value) {
            if (value == null || value.equals(""))
                return null;

            return Boolean.valueOf(value);
        }
    },

    OBJ_TYPE {
        @Override public Object fromStr(String value) {
            return value;
        }
    },

    CSL_AFFINITYPARTICLES {
        @Override public Object fromStr(String value) {
            return new StringBuilder(value);
        }
    },

    CSL_DICTS {
        @Override public Object fromStr(String value) {
            return new StringBuilder(value);
        }

    },

    STRING {
        @Override public Object fromStr(String value) {
            return value;
        }
    };

    public abstract Object fromStr(String value);
}
