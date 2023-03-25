package com.scipriano.stask


class Tasks{
     public fun getTasks():List<Task> {
        return arrayListOf(
            Task("Estudar fisica",done = false),
            Task("Estudar quimica",done = false),
            Task("Estudar biologia",done = false)
        ).toList()
    }

    data class Task(val name: String, val done: Boolean);

}


