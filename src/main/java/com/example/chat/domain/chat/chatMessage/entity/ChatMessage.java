package com.example.chat.domain.chat.chatMessage.entity;

import com.example.chat.base.jpa.baseEntity.BaseEntity;
import com.example.chat.domain.chat.chatRoom.entity.ChatRoom;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Setter
@Getter
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@SuperBuilder
@ToString(callSuper = true)
public class ChatMessage extends BaseEntity {
    @ManyToOne
    private ChatRoom chatRoom;

    private String writerName;

    private String content;
}
