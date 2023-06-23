package com.example.oldcarshowroom.mail.service;


import java.time.format.DateTimeFormatter;

import com.example.oldcarshowroom.model.dto.*;
import com.example.oldcarshowroom.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EMailService {

    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    BuyCarRequestRepository buyCarRequestRepository;

    @Autowired
    SaleCarRequestRepository saleCarRequestRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ShowroomRepository showroomRepository;

    @Autowired
    CarRepository carRepository;

    @Value("${spring.mail.username}")
    private String sender;


    public String sendMailToBuyer(int buyCarRequestID) {
        //Lấy ra Buy Car Request vừa được duyệt
        BuyCarRequestDto buyCarRequestDto = buyCarRequestRepository.findById(buyCarRequestID).orElseThrow();
        //Lấy ra thông tin người mua
        UserDto userDto = userRepository.findById(buyCarRequestDto.getUserDto().getUserID()).orElseThrow();
        //Lấy ra thông tin của Showroom
        ShowroomDto showroomDto = showroomRepository.findById(buyCarRequestDto.getShowroomDto().getShowroomID()).orElseThrow();
        //Mail Subject
        String subject = "Thông Báo Trạng Thái Yêu Cầu Mua Xe Của Bạn";
        //Nội dung mail
        String msgBody = "Hi " + userDto.getFullName() + ",\n\n"
                + "Tôi là đại diện của "+ showroomDto.getShowroomName() + ".\n"
                + "Đơn mua xe của bạn đã được chúng tôi chấp nhận, \n"
                + "Vui lòng bạn đến địa chỉ showroom: " + showroomDto.getShowroomAddress() +"\n"
                + "Vào lúc: " + buyCarRequestDto.getDateTrading().format(DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy")) + "\n"
                + "Để xem tình trạng xe và thương lượng! \n"
                + "Vui lòng liên hệ chúng tôi qua số điện thoại: " + showroomDto.getShowroomPhone()
                + " nếu bạn muốn biết thêm thông tin\n\n"
                + "Trân trọng cám ơn, \n"
                + showroomDto.getShowroomName();
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            // setup mail
            mailMessage.setFrom(sender);
            mailMessage.setTo(userDto.getMail());
            mailMessage.setSubject(subject);
            mailMessage.setText(msgBody);

            //Gửi mail
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }
        // Ném lỗi nếu ko gửi đc mail
        catch (Exception e) {
            return "Error while Sending Mail";
        }
    }


    public String sendMailToSaler(int saleCarRequestID) {
        //Lấy ra Sale Car Request vừa được duyệt
        SaleCarRequestDto saleCarRequestDto = saleCarRequestRepository.findById(saleCarRequestID).orElseThrow();
        //Lấy ra thông tin người bán
        UserDto userDto = userRepository.findById(saleCarRequestDto.getUserDto().getUserID()).orElseThrow();
        //Lấy ra thông tin của Showroom
        ShowroomDto showroomDto = showroomRepository.findById(saleCarRequestDto.getShowroomDto().getShowroomID()).orElseThrow();
        //Mail Subject
        String subject = "Thông Báo Trạng Thái Yêu Cầu Bán Xe Của Bạn";
        //Nội dung mail
        String msgBody = "Hi " + userDto.getFullName() + ",\n\n"
                + "Tôi là đại diện của "+ showroomDto.getShowroomName() + ".\n"
                + "Đơn bán xe của bạn đã được chúng tôi chấp nhận, \n"
                + "Vui lòng mang xe của bạn đến địa chỉ showroom: " + showroomDto.getShowroomAddress() +"\n"
                + "Vào lúc: " + saleCarRequestDto.getDateTrading().format(DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy")) + "\n"
                + "Để chúng tôi xem xét tình trạng xe và thương lượng! \n"
                + "Vui lòng liên hệ chúng tôi qua số điện thoại: " + showroomDto.getShowroomPhone()
                + " nếu bạn muốn biết thêm thông tin.\n\n"
                + "Trân trọng cám ơn, \n"
                + showroomDto.getShowroomName();
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            // setup mail
            mailMessage.setFrom(sender);
            mailMessage.setTo(userDto.getMail());
            mailMessage.setSubject(subject);
            mailMessage.setText(msgBody);

            //Gửi mail
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }
        // Ném lỗi nếu ko gửi đc mail
        catch (Exception e) {
            return "Error while Sending Mail";
        }
    }

    public String sendMailToSalerToTransfer(int buyCarRequestID) {
        //Lấy ra Buy Car Request vừa Thương Lượng thành công
        BuyCarRequestDto buyCarRequestDto = buyCarRequestRepository.findById(buyCarRequestID).orElseThrow();
        //Lấy ra thông tin xe và người bán
        CarDto carDto = carRepository.findById(buyCarRequestDto.getCarDto().getCarID()).orElseThrow();
        UserDto salerDto = userRepository.findById(carDto.getUserDto().getUserID()).orElseThrow();
        //Lấy ra thông tin của Showroom
        ShowroomDto showroomDto = showroomRepository.findById(buyCarRequestDto.getShowroomDto().getShowroomID()).orElseThrow();
        //Mail Subject
        String subject = "Thông Báo Hẹn Làm Giấy Tờ Sang Tên Xe";
        //Nội dung mail
        String msgBody = "Hi " + salerDto.getFullName() + ",\n\n"
                + "Tôi là đại diện của "+ showroomDto.getShowroomName() + ".\n"
                + "Xe " + carDto.getCarName() + " của bạn đã có khách xác nhận mua. \n"
                + "Tôi sẽ liên lạc với bạn sớm nhất để hẹn lịch làm giấy tờ xe. \n"
                + "Vui lòng liên hệ chúng tôi qua số điện thoại: " + showroomDto.getShowroomPhone()
                + " nếu bạn muốn biết thêm thông tin. \n\n"
                + "Trân trọng cám ơn, \n"
                + showroomDto.getShowroomName();
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            // setup mail
            mailMessage.setFrom(sender);
            mailMessage.setTo(salerDto.getMail());
            mailMessage.setSubject(subject);
            mailMessage.setText(msgBody);

            //Gửi mail
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }
        // Ném lỗi nếu ko gửi đc mail
        catch (Exception e) {
            return "Error while Sending Mail";
        }
    }


}
