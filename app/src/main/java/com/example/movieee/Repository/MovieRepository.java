package com.example.movieee.Repository;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.xml.transform.Result;

public interface MovieRepository {
    MutableLiveData<List<Result>> getTopRatedMovielist();
}
