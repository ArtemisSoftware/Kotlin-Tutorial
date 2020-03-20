package com.artemis.software.kotlintutorial.inheritance

class GenericRepository<T> : Repository<T> {

    override fun geById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }

}

interface Repo {
    fun <T> getById(id: Int): T
    fun <R> getAll(): List<R>
}

class MyRepo: Repo{
    override fun <T> getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun <T> getAll(): List<T> {
        TODO("Not yet implemented")
    }

}