package Database;

//Interface for objects that require cleanup post-use. Call dispose() in finally block! 
public interface IDisposable 
{ 
    public void Dispose(); 
} 
