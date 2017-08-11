package com.fernandocejas.sample.features.movies

import com.fernandocejas.sample.framework.executor.ExecutionScheduler
import com.fernandocejas.sample.framework.interactor.UseCase
import javax.inject.Inject

class GetMovies
@Inject constructor(private val moviesRepository: MoviesRepository, scheduler: ExecutionScheduler) : UseCase<List<Movie>, Void>(scheduler) {
    override fun buildObservable(params: Void?) = moviesRepository.movies()
}