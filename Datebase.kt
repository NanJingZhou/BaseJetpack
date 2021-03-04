@Database(entities = [Author::class, HotWord::class], version = 1)
abstract class Datebase : RoomDatabase() {

    abstract fun dao(): Dao

 

    companion object {

        private var instance: Db? = null

        @Synchronized
        fun instance(): Db {
            @Synchronized
            if (instance == null) {
                instance = Room.databaseBuilder(
                    BaseApplication.instance,
                    Db::class.java,
                    "WanAndroidDB"
                ).build()
            }

            return instance!!
        }
    }
}
