package com.example.movieee.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.movieee.Repository.MovieRepository;
import com.example.movieee.Repository.MovieRepositoryImpl;

import java.util.List;

import javax.xml.transform.Result;

public class MovieListViewmodel extends AndroidViewModel {

    MovieRepository mRepo;
    public MovieListViewmodel(@NonNull Application application) {
        super(application);
        mRepo= MovieRepositoryImpl.getInstance(application);
    }

    public LiveData<List<Result>> getTopratedMovieList(){
        return mRepo.getTopRatedMovielist();
    }
}
