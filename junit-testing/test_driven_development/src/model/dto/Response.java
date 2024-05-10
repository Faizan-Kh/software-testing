package model.dto;

import java.util.ArrayList;

public class Response {
    ArrayList<Message> messageList;

    public Response()  {
        this.messageList = new ArrayList<>();
    }

    public boolean isSuccessful()  {
        return !hasError();
    }

    public boolean hasError() {
        for(Message m : messageList)
        {
            if(m.Type == MessageType.Error || m.Type == MessageType.Exception)
                return true;
        }
        return false;
    }

    public String getErrorMessages() {
        StringBuilder sb = new StringBuilder();
        for(Message m : messageList)
        {
            if(sb.length() > 0)
                sb.append(",\n");
            if(m.Type == MessageType.Error || m.Type == MessageType.Exception)
                sb.append(m.Message);
        }
        return sb.toString();
    }

    public String getInfoMessages() {
        StringBuilder sb = new StringBuilder();
        for(Message m : messageList)
        {
            if(sb.length() > 0)
                sb.append(",\n");
            if(m.Type == MessageType.Information)
                sb.append(m.Message);
        }
        return sb.toString();
    }

    public boolean isSuccessfull() {
        return !hasError();
    }
}
