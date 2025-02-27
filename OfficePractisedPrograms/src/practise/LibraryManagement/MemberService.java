package practise.LibraryManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Integer;
import java.util.Date;

class MemberService{
	
	private List<Member> members;

    public MemberService() {
        this.members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("members : "+members);
    }

    public List<Member> getAllMembers() {
        return members;
    }
}    
