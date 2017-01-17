package com.example.ameen.personalassistant.database;

import android.provider.BaseColumns;

/**
 * Created by Ameen on 16-Jan-17.
 */

public class TaskContract {
    public static final String DB_NAME = "com.example.ameen.personalassistant.database";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";

    }
}
