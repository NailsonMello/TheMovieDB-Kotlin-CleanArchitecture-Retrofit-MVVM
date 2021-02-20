package com.nailson.tmdb.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nailson.tmdb.data.model.movie.Movie
import com.nailson.tmdb.data.model.tvshow.TvShow
import com.nailson.tmdb.data.model.artist.Artist

@Database(entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase(){
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao

}