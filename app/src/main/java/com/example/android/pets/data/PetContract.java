package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Damian on 7/5/2017.
 */

public final class PetContract {
    private PetContract() {
    }

    ;

    public static class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";

        public static final String COLUMN_NAME_ID = BaseColumns._ID;
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_BREED = "breed";
        public static final String COLUMN_NAME_GENDER = "gender";
        public static final String COLUMN_NAME_WEIGHT = "weight";

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;
    }
}
