namespace java edu.umn.cs.distributedfilesystem

exception FileNotFoundException {
    1:string message,
}

service NodeDFSService
{
    string read(1:string filename) throws (1:FileNotFoundException e),
    i32 write(1:string filename,2:string contents)
}