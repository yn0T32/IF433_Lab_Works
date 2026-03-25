package oop_00000124960_AntonyChandra.week7

enum class SystemStates {
    STARTING, RUNNING, STOPPED;

}
sealed class ApiResponse{
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}