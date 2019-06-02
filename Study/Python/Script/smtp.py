import smtplib
from email import message

from_addr = 'wjdtmdrl12@gmail.com'
to_addr = 'wjdtmdrl12@gmail.com'
subject = 'Sending email by Python Script'
body = 'Test'

msg = message.Message()
msg.add_header('from', from_addr)
msg.add_header('to', to_addr)
msg.add_header('subject', subject)
msg.set_payload(body)

server = smtplib.SMTP('smtp.gmail.com', 587)
server.ehlo()
server.login(from_addr, 'gokos7lovepp')
server.send_message(msg, from_addr=from_addr, to_addrs=[to_addr])
