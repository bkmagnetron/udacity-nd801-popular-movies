package com.krishnaentertainment.nd801.popularmovies.models;

import android.net.Uri;

public class GlobalConstants {
    public static final Uri TMDB_MOVIE_BASE_URL = Uri.parse("http://api.themoviedb.org/3/discover/movie");
    public static final Uri TMDB_IMAGE_BASE_URL = Uri.parse("http://image.tmdb.org/t/p/");
    public static final String TMDB_SORT_DESC = ".desc";
    public static final String TMDB_SORT_ASC = ".asc";

    public static final String TMDB_PARAM_PAGE = "page";
    public static final String TMDB_PARAM_API_KEY = "api_key";

    public static final String TMDB_PARAM_SORT_BY = "sort_by";
    public static final String TMDB_PARAM_ID = "id";
    public static final String TMDB_PARAM_TITLE = "title";
    public static final String TMDB_PARAM_POSTER_PATH = "poster_path";
    public static final String TMDB_PARAM_BACKDROP_PATH = "backdrop_path";
    public static final String TMDB_PARAM_OVERVIEW = "overview";
    public static final String TMDB_PARAM_RELEASE_DATE = "release_date";
    public static final String TMDB_PARAM_POPULARITY = "popularity";
    public static final String TMDB_PARAM_VOTE_AVERAGE = "vote_average";
    public static final String TMDB_PARAM_VOTE_COUNT = "vote_count";

    public static final String TMDB_MOVIE_RESULTS = "results";
}
