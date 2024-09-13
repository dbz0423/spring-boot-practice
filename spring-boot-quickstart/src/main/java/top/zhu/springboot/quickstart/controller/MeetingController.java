package top.zhu.springboot.quickstart.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhu.springboot.quickstart.enetity.Meeting;
import top.zhu.springboot.quickstart.service.MeetingService;

@RestController
@RequestMapping("/meetings")
public class  MeetingController {
    private final MeetingService meetingService;

    public MeetingController(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @PostMapping("/check")
    public ResponseEntity<String> checkAvailability(@RequestBody Meeting meeting) {
        if (meetingService.isRoomAvailable(meeting)) {
            meetingService.addMeeting(meeting);
            return ResponseEntity.ok("会议室可用，会议已预定！");
        }else {
            return ResponseEntity.status(409).body("会议室不可用!");
        }
    }

}
