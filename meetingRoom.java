import java.util.Queue;

public class MeetingNode {   
    boolean up;
    boolean down;
    boolean right;
    boolean left;
    boolean isMeeting;
    boolean isVisited;
}


// 返回步长
public int getNearestMeeting(List<List<MeetingNode>> room, int personX, int personY ) {
    if(room == null || room.length() == 0)
        return -1;
    
    int distance = 0;
    int row = room.size();
    int col = room.get(0).size();
    MeetingNode node = room.get(personX).get(personY);
    Queue<MeetingNode> queue = new Queue<MeetingNode>();
    queue.add(node);
    while(!queue.isEmpty()) {
        node = queue.pop();
        
        if(node.isMeeting && !node.isVisited) {
            return distance;
        }
        node.isVisited = true;
        // up
        if(node.up && ++personY < row) {
            node = room.get(personX).get(++personY);
            if(!node.isVisited && node.isMeeting) 
                return distance;
            else if(!node.isVisited)
                queue.add(node);
        }
        
        // down
        if(node.down && --personY > 0) {
            node = room.get(personX).get(--personY);
            if(!node.isVisited && node.isMeeting) 
                return distance;
            else if(!node.isVisited)
                queue.add(node);
        }

        // right
        if(node.right && ++personX < col) {
            node = room.get(++personX).get(personY);
            if(!node.isVisited && node.isMeeting) 
                return distance;
            else if(!node.isVisited)
                queue.add(node);
        }

        // left
        if(node.left && --personX > 0) {
            node = room.get(--personX).get(personY);
            if(!node.isVisited && node.isMeeting) 
                return distance;
            else if(!node.isVisited)
                queue.add(node);
        }
        ++distance;
    }
    return distance == 0 ? -1 : distance;
}