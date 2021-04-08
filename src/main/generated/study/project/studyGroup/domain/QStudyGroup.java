package study.project.studyGroup.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudyGroup is a Querydsl query type for StudyGroup
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStudyGroup extends EntityPathBase<StudyGroup> {

    private static final long serialVersionUID = -157035582L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudyGroup studyGroup = new QStudyGroup("studyGroup");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath leaderId = createString("leaderId");

    public final ListPath<MemberStudyGroup, QMemberStudyGroup> memberStudyGroups = this.<MemberStudyGroup, QMemberStudyGroup>createList("memberStudyGroups", MemberStudyGroup.class, QMemberStudyGroup.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final QNotice notice;

    public final EnumPath<GroupStatus> status = createEnum("status", GroupStatus.class);

    public QStudyGroup(String variable) {
        this(StudyGroup.class, forVariable(variable), INITS);
    }

    public QStudyGroup(Path<? extends StudyGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudyGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudyGroup(PathMetadata metadata, PathInits inits) {
        this(StudyGroup.class, metadata, inits);
    }

    public QStudyGroup(Class<? extends StudyGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notice = inits.isInitialized("notice") ? new QNotice(forProperty("notice"), inits.get("notice")) : null;
    }

}

