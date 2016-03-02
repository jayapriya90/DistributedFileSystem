namespace java edu.umn.cs.distributedfilesystem

struct NodeInfo {
  1: i32 id,
  2: string hostname,
  3: i32 port
}

enum State {
    ACK,
    NACK
}