package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Damian on 7/5/2017.
 */

public final class PetContract {
    private PetContract() {
    }

    public static class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;

        public static final String TEXT_TYPE = " TEXT";
        public static final String INTEGER_TYPE = " INTEGER";
        public static final String COMMA_SEP = ",";



    }
}
